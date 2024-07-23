import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();

        Rectangle rect1 = new Rectangle(100, 100, Color.RED);
        Rectangle rect2 = new Rectangle(100, 100, Color.GREEN);
        Rectangle rect3 = new Rectangle(100, 100, Color.BLUE);

        grid.add(rect1, 0, 0);
        grid.add(rect2, 1, 0);
        grid.add(rect3, 2, 0);

        ColumnConstraints column1 = new ColumnConstraints();
        ColumnConstraints column2 = new ColumnConstraints();
        ColumnConstraints column3 = new ColumnConstraints();

        column1.setPercentWidth(33.3);
        column2.setPercentWidth(33.3);
        column3.setPercentWidth(33.3);

        grid.getColumnConstraints().addAll(column1, column2, column3);

        Scene scene = new Scene(grid, 300, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
