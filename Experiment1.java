import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Experiment1 extends Application {
    private ObservableList<String> tasks = FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage) {
        TextField taskInput = new TextField();
        Button addButton = new Button("Add Task");
        ListView<String> taskList = new ListView<>(tasks);

        addButton.setOnAction(e -> {
            String task = taskInput.getText();
            if (!task.isEmpty()) {
                tasks.add(task);
                taskInput.clear();
            }
        });

        VBox root = new VBox(10, taskInput, addButton, taskList);
        Scene scene = new Scene(root, 300, 400);

        primaryStage.setTitle("To-Do List");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
