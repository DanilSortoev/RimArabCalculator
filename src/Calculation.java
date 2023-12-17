class Calculation {
    static void calc(String sign, String firstNum, String secondNum, boolean flag1, boolean flag2, String[] rimNums) {
        int firstValue = Integer.parseInt(firstNum);
        int secondValue = Integer.parseInt(secondNum);
        if ((firstValue > 10) || (secondValue > 10))
            throw new IllegalArgumentException("Введите значения от 1 до 10!");
        int result = 0;
        switch (sign) {
            case "+":
                result = firstValue + secondValue;
                break;
            case "-":
                result = firstValue - secondValue;
                break;
            case "*":
                result = firstValue * secondValue;
                break;
            case "/":
                result = firstValue / secondValue;
                break;
        }
        String rimResult;
        if ((flag1) && (flag2)) {
            if (result < 1) throw new ArithmeticException("В римской системе нет отрицательных чисел!");
            rimResult = rimNums[result - 1];
            System.out.println(rimResult);
        }
        else {
            System.out.println(result);
        }
    }
}