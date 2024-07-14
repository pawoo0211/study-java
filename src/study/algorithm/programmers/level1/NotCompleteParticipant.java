package study.algorithm.programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class NotCompleteParticipant {

    public String find(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> participantMap = initMap(participant);
        Map<String, Integer> completionMap = initMap(completion);

        for (String thisParticipant : participant) {
            if (completionMap.containsKey(thisParticipant)) {
                if (completionMap.get(thisParticipant) > 0) {
                    participantMap.put(thisParticipant, participantMap.get(thisParticipant) -1);
                    completionMap.put(thisParticipant, completionMap.get(thisParticipant) - 1);
                } else if (completionMap.get(thisParticipant) == 0) {
                    answer = thisParticipant;
                    break;
                }
            } else {
                return thisParticipant;
            }
        }

        return answer;
    }

    private Map<String, Integer> initMap(String[] people) {
        Map<String, Integer> completionMap = new HashMap<>();
        for (String thisCompletion : people) {
            completionMap.put(thisCompletion, completionMap.getOrDefault(thisCompletion, 0) + 1);
        }

        return completionMap;
    }
}
