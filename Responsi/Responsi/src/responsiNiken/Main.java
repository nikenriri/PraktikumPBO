package responsiNiken;

/**
 *
 * @author niken riri
 */

public class Main {

    public static void main(String[] args) {
        movieView view = new movieView();
        movieModel model = new movieModel();
        controlerMovie controller = new controlerMovie(model, view);
    }
    
}
