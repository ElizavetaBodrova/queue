public class MyQueueTest {
    /**
     * @param queue1
     * @param queue2
     * @return число шагов, через которое одна из очередей станет пустой
     */
    public int test(MyQueue<Float> queue1, MyQueue<Float> queue2) {
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
