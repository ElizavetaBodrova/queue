import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Даны две очереди X и Y, содержащие вещественные числа.
 * Из каждой очереди одновременно извлекается по одному числу,
 * х и у соответственно. Если х < у, то число (х + у)
 * помещается в конец очереди X, иначе число (х–у)
 * помещается в конец очереди Y.
 * Необходимо определить число шагов, через которое одна из очередей станет пустой.
 */
public class Main {
    public static void main(String[] args) {
        //test for java queue
        Queue<Float> q1 = new ArrayDeque<>();
        q1.offer(1.0F);
        q1.offer(2.0F);
        q1.offer(1.0F);
        Queue<Float> q2 = new ArrayDeque<>();
        q2.offer(2.0F);
        q2.offer(1.0F);
        q2.offer(2.0F);
        System.out.println(new JavaQueueTest().test(q1,q2));
    }
}
