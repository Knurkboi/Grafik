import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;

public class JavaFXClass extends Application {
	
	Scene scene;
	final double WIDTH = 600;
	final double HEIGHT = 600;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		scene = upg5();

		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public Scene upg1(){
		
		Group root1 = new Group();
		
		Scene scene = new Scene(root1,WIDTH,HEIGHT);
		
		Circle circ = new Circle(1,300,200);
		circ.setTranslateX(WIDTH/2-circ.getStrokeWidth()/2);
		circ.setFill(Color.RED);
		
		root1.getChildren().add(circ);
	
		return scene;
	}
	
	public Scene upg2(){
		
		Group root1 = new Group();
		
		Scene scene = new Scene(root1,WIDTH,HEIGHT);
		
		for(int i = 0; i < 50 ; i++){
			Circle cir = new Circle(20);
            cir.setTranslateX(Math.random()*WIDTH-cir.getCenterX());
            cir.setTranslateY(Math.random()*HEIGHT-cir.getCenterY());
            cir.setFill(Color.BLACK);
            root1.getChildren().add(cir);
		}
		return scene;
	}
	
public Scene upg3(){
		
		Group root1 = new Group();
		
		Scene scene = new Scene(root1,WIDTH,HEIGHT);
		
		Rectangle rect1 = new Rectangle(WIDTH/2,HEIGHT/2);
		Rectangle rect2 = new Rectangle(WIDTH/2,HEIGHT/2);
		Rectangle rect3 = new Rectangle(WIDTH/2,HEIGHT/2);
		Rectangle rect4 = new Rectangle(WIDTH/2,HEIGHT/2);
		
		rect1.setTranslateX(0);
        rect1.setTranslateY(0);
        rect1.setFill(Color.BLUE);
        root1.getChildren().add(rect1);
        
        rect2.setTranslateX(WIDTH/2);
        rect2.setTranslateY(0);
        rect2.setFill(Color.RED);
        root1.getChildren().add(rect2);
        
        rect3.setTranslateX(0);
        rect3.setTranslateY(HEIGHT/2);
        rect3.setFill(Color.YELLOW);
        root1.getChildren().add(rect3);
        
        rect4.setTranslateX(WIDTH/2);
        rect4.setTranslateY(HEIGHT/2);
        rect4.setFill(Color.GREEN);
        root1.getChildren().add(rect4);
		return scene;
	}

	public Scene upg4(){
		
		Group root1 = new Group();
		
		Scene scene = new Scene(root1,WIDTH,HEIGHT);
		
		Rectangle rect1 = new Rectangle(WIDTH,HEIGHT/3);
		Rectangle rect2 = new Rectangle(WIDTH,HEIGHT/3);
		Rectangle rect3 = new Rectangle(WIDTH,HEIGHT/3);
		
		rect1.setTranslateX(0);
	    rect1.setTranslateY(0);
	    rect1.setFill(Color.WHITE);
	    root1.getChildren().add(rect1);
	    
	    rect2.setTranslateX(0);
	    rect2.setTranslateY(HEIGHT/3);
	    rect2.setFill(Color.BLUE);
	    root1.getChildren().add(rect2);
	    
	    rect3.setTranslateX(0);
	    rect3.setTranslateY(HEIGHT-200);
	    rect3.setFill(Color.RED);
	    root1.getChildren().add(rect3);
	    
		return scene;
	}
	
public Scene upg5(){
		
	 Group root1 = new Group();
     Scene scene = new Scene(root1,WIDTH,HEIGHT);

     Rectangle rect1 = new Rectangle(WIDTH/12,HEIGHT/12);

     rect1.setTranslateX(WIDTH/2 - HEIGHT/12);
     rect1.setTranslateY(HEIGHT/2 - HEIGHT/12);
     rect1.setFill(Color.BLUE);
     root1.getChildren().add(rect1);

     scene.setOnKeyPressed(event -> {

         KeyCode key = event.getCode();

         int speed = 20;

         switch (key) {

             case UP:
                 rect1.setTranslateY(rect1.getTranslateY() - speed);
             break;
             case DOWN:
                 rect1.setTranslateY(rect1.getTranslateY() + speed);
             break;

             case LEFT:
                 rect1.setTranslateX(rect1.getTranslateX() - speed);
             break;

             case RIGHT:
                 rect1.setTranslateX(rect1.getTranslateX() + speed);
             break;

         }

     });


     return scene;
	    
	}
	

	public static void main(String[] args) {
		launch();
	}

}