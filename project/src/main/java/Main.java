import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import pl.project_competencies.connection.SessionFactoryConfig;
import pl.project_competencies.mutex.Mutex.Mutex;
import java.io.FileNotFoundException;


public class Main extends Application {



    public static void main(String[] args) throws FileNotFoundException {
        Mutex mutex = new Mutex();
        boolean  lockFile = mutex.lockInstance("LockFile");
        if(lockFile) {
            launch(args);
        }
    }

    @Override
    public void start(Stage primaryStage) {


        SessionFactoryConfig.getSessionFactory();
            primaryStage.setTitle("Hello World!");
            Button btn = new Button();
            btn.setText("Say 'Hello World'");
            btn.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Hello World!");
                }
            });

            StackPane root = new StackPane();
            root.getChildren().add(btn);
            primaryStage.setScene(new Scene(root, 300, 250));
            primaryStage.show();
        }

        @Override
        public void stop(){
            SessionFactoryConfig.getSessionFactory().close();
        }



}

