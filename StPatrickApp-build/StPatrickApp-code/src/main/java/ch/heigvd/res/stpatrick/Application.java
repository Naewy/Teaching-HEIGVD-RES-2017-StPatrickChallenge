package ch.heigvd.res.stpatrick;


/**
 * 
 * @author Olivier Liechti
 */
public class Application {

  IStreamProcessorsFactory processorsFactory = new StreamProcessorsFactory();
  IStreamDecoratorController decoratorControler = new StreamDecoratorControler();
  
  public IStreamProcessorsFactory getStreamProcessorsFactory() {
    return processorsFactory;
  }

  IStreamDecoratorController getStreamDecoratorController() {
    return decoratorControler;
  }
}
