class Initialization {
    static void initial(String expression) {
        String[] rimNums = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV",
                "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII",
                "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII",
                "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII",
                "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII",
                "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII",
                "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        String[] input = expression.split(" ");
            if (input.length == 1)
                throw new ArrayIndexOutOfBoundsException("строка не является математической операцией!");
            if (input.length != 3)
                throw new ArrayIndexOutOfBoundsException("формат математической операции не удовлетворяет заданию!");
        String firstNum = input[0];
        String secondNum = input[2];
        String sign = input[1];
        boolean flag1 = false;
        boolean flag2 = false;
        for (int i = 0; i < 10; i++) {
            if (firstNum.equals(rimNums[i])) {
                firstNum = String.valueOf(i + 1);
                flag1 = true;
                break;
            }
            else {
                throw new NumberFormatException("Введите значения от 1 до 10!");
            }
        }
        for (int j = 0; j < 10; j++) {
            if (secondNum.equals(rimNums[j])) {
                secondNum = String.valueOf(j + 1);
                flag2 = true;
                break;
            }
            else {
                throw new NumberFormatException("Введите значения от 1 до 10!");
            }
        }
        if ((flag1 && !flag2) || (!flag1 && flag2))
            throw new ArithmeticException("Используются одновременно разные системы счисления!");
        Calculation calculation = new Calculation();
        calculation.calc(sign, firstNum, secondNum, flag1, flag2, rimNums);
    }
}
