package bridge.constant;

import static bridge.constant.Rules.MAX_BRIDGE_SIZE;
import static bridge.constant.Rules.MIN_BRIDGE_SIZE;

public class ErrorMessage {

    public static final String ERROR_PREFIX = "[ERROR] ";
    public static final String WRONG_BRIDGE_SIZE = "다리의 길이는 " + MIN_BRIDGE_SIZE + "부터 " + MAX_BRIDGE_SIZE + "사이의 정수여야 합니다.";

}