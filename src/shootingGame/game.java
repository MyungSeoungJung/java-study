package shootingGame;

import javax.swing.*;
import java.awt.*;

public class game {
    public static void main(String[] ar){
        game_Frame fms = new game_Frame();
    }
}

class game_Frame extends JFrame{

    int f_width = 800;
    int f_height = 600;

    Toolkit tk = Toolkit.getDefaultToolkit();
    //이미지를 불러오기 위한 툴킷
    Image me_img = tk.getImage("HH");
    // f15k.png 라는 이미지를 불러옵니다.
    game_Frame(){
        init();
        start();

        setTitle("슈팅 게임 만들기");
        setSize(f_width, f_height);
        Dimension screen = tk.getScreenSize();

        int f_xpos = (int)(screen.getWidth() / 2 - f_width / 2);
        int f_ypos = (int)(screen.getHeight() / 2 - f_height / 2);

        setLocation(f_xpos, f_ypos);
        setResizable(false);
        setVisible(true);
    }

    public void init(){
    }
    public void start(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//프레임 오른쪽 위에 X버튼을 눌렀을때
        //프로그램이 정상적으로 종료하게 만들어 줍니다.
    }
    public void paint(Graphics g){

        g.clearRect(0, 0, f_width, f_height);
// 0,0 에서 위에서 정한 해상도 크기만큼 화면을 지웁니다.
        g.drawImage(me_img, 100, 100, this);
//프레임에 me_img에 저장된 f15k.png 이미지를
        //x=100, y=100 좌표로 그려넣습니다.

    }
}
