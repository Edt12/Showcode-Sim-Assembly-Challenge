import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        int[] input = {186, 200, 141, 200, 900};

        int programCounter = 0;
        int ACC = 0;
        int BAK = 0;
        int temp = 0;
        ArrayList <Integer> instructions = new ArrayList<Integer>();
        ArrayList <Integer> values = new ArrayList<Integer>();


        for (int elem : input){
            String inputString = Integer.toString(elem);
            String intermediateInstruction = inputString.substring(0,1);
            int instruction = Integer.parseInt(intermediateInstruction);
            instructions.add(instruction);
            //get value
            String intermediateValue = inputString.substring(1,3);
            int value = Integer.parseInt(intermediateValue);
            values.add(value);
        }
        int value;
        int currentInstruction;
        for (int i = 0; i < instructions.size();i++){
            value = values.get(i);
            currentInstruction = instructions.get(i);
            System.out.println(currentInstruction);
            switch(currentInstruction){
                case 1:
                    ACC = value;
                    break;
                case 2:
                    System.out.println("SWAPPING");
                    temp = ACC;
                    ACC = BAK;
                    BAK = temp;
                    break;
                case 3:
                    BAK = ACC;
                    ACC = 0;

                    break;
                case 4:
                    ACC += value;
                    i++;
                    break;
                case 5:
                    ACC -= value;
                    break;
                case 6:
                    ACC = ACC * -1;
                    break;
                case 7:
                    i = value;
                    break;
                case 8:
                    if (ACC > 0){
                        i = value;
                    }

                    break;
                case 9:
                    i = instructions.size();
                    System.out.println(ACC);
                    i++;
                    break;

                default:
                    break;
            }

        }

    }

}
