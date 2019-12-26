package main.java.com.kcorkrad;

public class OpCodeSys {

    public Integer[] getResult(Integer[] input) {

        int opCodeLocation = 0;
        int resultPosition;
        int instruction = input[opCodeLocation];

        while (instruction != 99) {
            if (instruction == 1) {
                resultPosition = input[opCodeLocation + 3];
                input[resultPosition] = input[opCodeLocation + 1] + input[opCodeLocation + 2];

            }
            if (instruction == 2) {
                resultPosition = input[opCodeLocation + 3];
                input[resultPosition] = input[opCodeLocation + 1] * input[opCodeLocation + 2];
            }
            if (instruction == 99) {
                break;
            }
            opCodeLocation += 4;
        }

        return input;
    }
}
