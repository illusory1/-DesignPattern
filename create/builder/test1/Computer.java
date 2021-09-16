package design_patterns.create.builder.test1;

/**
 * <p>Title: Comper</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 12:32 下午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public abstract class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOs;

    protected Computer(){
    }


    public void setBoard(String board){
        mBoard=board;
    }

    public void setDisplay(String display) {
        this.mDisplay = display;
    }


    public abstract void setOs() ;


    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOs='" + mOs + '\'' +
                '}';
    }
}
