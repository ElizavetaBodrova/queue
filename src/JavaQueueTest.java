import java.util.Queue;

public class JavaQueueTest {
    /**
     * @param queue1
     * @param queue2
     * @return число шагов, через которое одна из очередей станет пустой
     */
    public int test(Queue<Float> queue1, Queue<Float> queue2) {
        int count = 0;
        Float x;
        Float y;
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            x = queue1.poll();
            y = queue2.poll();
            count++;
            if (x < y) {
                queue1.offer(x + y);
            } else {
                queue2.offer(x - y);
            }

        }
        return count;
    }
}
