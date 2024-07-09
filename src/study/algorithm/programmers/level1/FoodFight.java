package study.algorithm.programmers.level1;

public class FoodFight {

    public String sort(int[] food) {
        String answer = "";

        for (int index = 1; index < food.length; index++) {
            int quotient = food[index] / 2;
            answer = answer + String.valueOf(index).repeat(quotient);
        }

        StringBuffer stringBuffer = new StringBuffer(answer);
        return answer + "0" + stringBuffer.reverse();
    }
}
