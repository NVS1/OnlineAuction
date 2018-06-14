package HW_Lesson_7.Task_2_ComparablePair;

public class ComparablePair<T extends Comparable>{
    private final T object1;
    private final T object2;

    public ComparablePair(T object1, T object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public T bigger(){
      if (object1.compareTo(object2)>=0){
          return object1;
      }
      return object2;
    }
    public T smaller (){
        if (object1.compareTo(object2)<0){
            return object1;
        }
        return object2;
    }

}
