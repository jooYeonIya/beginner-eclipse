package beginnerJava.src.ch09;

public class ButtonDemo {
    public static void main(String[] args) {
        Button okbutton = new Button();

        // Ok버튼이 클릭되었을 때 실행될 구현부를 작성
        class OKListener implements Button.ClickListener {
            @Override
            public void onClikc() {
                System.out.println("OK버튼 클릭");
            }
        }

        // 구현 객체 주입
        okbutton.setClickListener(new OKListener());

        // 버튼 누르기
        okbutton.press();
    }
}

class Button {
    interface ClickListener {
        void onClikc();
    }

    // 외부에서 settter를 통해 ClickListener 구현 객체를 필드에 저장할 수 있도록 함
    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    // button이 클릭되어쓸 때 실행되는 메소드 선언
    public void press(){
        clickListener.onClikc();
    }
}
