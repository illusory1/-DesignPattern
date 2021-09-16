package design_patterns.create.builder.test1;

/**
 * <p>Title: Directorer</p>
 * <p>Description: </p>
 * <p>email: 845550284@qq.com</p>
 * <p>create date: 2021/8/22 10:19 下午</p>
 *
 * @author :fengjp
 * @version :1.0
 */
public class ComputerBuilder extends Builder {
    protected Computer computer = new MacBook();

    @Override
    void buildBoard(String board) {
        computer.setBoard(board);
    }

    @Override
    void buildDisplay(String display) {
        computer.setDisplay(display);
    }

    @Override
    void buildOs() {
        computer.setOs();
    }

    @Override
    Computer build() {
        return computer;
    }
}
