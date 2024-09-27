package pack.service;

import javax.swing.*;
import java.awt.*;

public class showImage extends JPanel {
    private Image image;

    public showImage(String a) {
        // 이미지 경로 설정 (프로젝트 경로에 이미지 파일이 있어야 합니다)
        image = new ImageIcon(a).getImage(); // image.jpg 경로에 맞게 수정
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }

    // JFrame을 생성하고 설정하는 메서드
    public void createAndShowGUI() {
        JFrame frame = new JFrame("Image Display");
        frame.add(this);
        frame.setSize(400, 300); // 프레임 크기 설정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    // 클래스 인스턴스를 생성하고 GUI를 보여주는 메서드
    public void display() {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
}