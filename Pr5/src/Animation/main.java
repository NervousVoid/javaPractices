package Animation;

import javax.swing.*;

public class main extends Animation{
    public static void main(String[] args) {
        new Animation();
        framlist.add(new ImageIcon("/Users/nervous_void/Yandex.Disk.localized/PC DESKTOP-00S89MD/Study/Java/Pr5/src/Animation/frames/video_000.jpg").getImage());
        framlist.add(new ImageIcon("/Users/nervous_void/Yandex.Disk.localized/PC DESKTOP-00S89MD/Study/Java/Pr5/src/Animation/frames/video_001.jpg").getImage());
        framlist.add(new ImageIcon("/Users/nervous_void/Yandex.Disk.localized/PC DESKTOP-00S89MD/Study/Java/Pr5/src/Animation/frames/video_002.jpg").getImage());
        framlist.add(new ImageIcon("/Users/nervous_void/Yandex.Disk.localized/PC DESKTOP-00S89MD/Study/Java/Pr5/src/Animation/frames/video_003.jpg").getImage());
        framlist.add(new ImageIcon("/Users/nervous_void/Yandex.Disk.localized/PC DESKTOP-00S89MD/Study/Java/Pr5/src/Animation/frames/video_004.jpg").getImage());
        framlist.add(new ImageIcon("/Users/nervous_void/Yandex.Disk.localized/PC DESKTOP-00S89MD/Study/Java/Pr5/src/Animation/frames/video_005.jpg").getImage());
        framlist.add(new ImageIcon("/Users/nervous_void/Yandex.Disk.localized/PC DESKTOP-00S89MD/Study/Java/Pr5/src/Animation/frames/video_006.jpg").getImage());
        framlist.add(new ImageIcon("/Users/nervous_void/Yandex.Disk.localized/PC DESKTOP-00S89MD/Study/Java/Pr5/src/Animation/frames/video_007.jpg").getImage());

        Animation animImg = new Animation();
        while (true)
        {
            for (int i = 0; i < 8; i++)
            {
                image = framlist.get(i);
                animImg.repaint();
                try
                {
                    Thread.sleep(50);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}