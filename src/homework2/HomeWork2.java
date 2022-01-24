package homework2;

public class HomeWork2 {
    public static void main(String args[]) {
        String[][] arr = new String[][]{{"1", "5", "3", "5"},
                {"2", "2", "2", "3"},
                {"1", "2", "2", "2"},
                {"2", "450", "2", "2"}};
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива не соответствует заявленному 4*4");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "*" + e.j);
        }

    }


    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int summ = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("Размер массива не соответствует заявленному 4*4");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Размер массива не соответствует заявленному 4*4");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    summ = summ + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return summ;
    }
}