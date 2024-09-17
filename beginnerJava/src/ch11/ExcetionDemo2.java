package beginnerJava.src.ch11;

public class ExcetionDemo2 {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i < array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println(i + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스 초과" + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환할 수 없음" + e.getMessage());

                // 두개 이상의 예외를 동일하게 처리하고 싶을 때는 | 사용
            // } catch (NullPointerException e | Exception ) {

            }
        }

    }
}
