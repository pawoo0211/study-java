package study.algorithm.programmers.level2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class DeployOrder {

    public int[] execute(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();

        int progressesLength = progresses.length;
        Queue<Integer> progressesQueue = new ArrayDeque<>();
        Queue<Integer> speedsQueue = new ArrayDeque<>();

        for (int index = 0; index < progressesLength; index++) {
            progressesQueue.add(progresses[index]);
            speedsQueue.add(speeds[index]);
        }

        while (!progressesQueue.isEmpty()) {
            if (progressesQueue.peek() < 100) {
                for (int index = 0; index < progressesQueue.size(); index++) {
                    int progress = progressesQueue.poll();
                    int speed = speedsQueue.poll();
                    progressesQueue.add(progress + speed);
                    speedsQueue.add(speed);
                }
            } else {
                int deployCount = 0;
                while (100 <= progressesQueue.peek()) {
                    deployCount++;
                    progressesQueue.poll();
                    speedsQueue.poll();

                    if (progressesQueue.isEmpty()) {
                        break;
                    }
                }
                result.add(deployCount);
            }
        }

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}