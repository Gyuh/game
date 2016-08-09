package test.testapp;

import java.util.TimerTask;

/**
 * Created by Administrator on 2016-08-08.
 */
public class reTimer extends TimerTask {
    int inTime = 10000;
    private GameView m_gameview;
    private GraphicObject [] m_GO;

    public reTimer(GameView gameview, GraphicObject [] GO) {
        m_gameview = gameview;
        m_GO = GO;
    }
    @Override
    public void run() {
        //System.out.println("INTIME!! - > " + inTime);
        m_GO[1].SetPosition(m_GO[1].getX() - (float)(m_gameview.tWidth * 0.00018),
                m_GO[1].getY());
        m_GO[2].SetPosition(m_GO[2].getX() - (float)(m_gameview.tWidth * 0.00018),
                m_GO[2].getY());
        inTime -= 5;
    }

    public int getTime() {
        return inTime;
    }
}