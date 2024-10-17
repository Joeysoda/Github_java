import java.util.List;

/**
 * Description:
 * Date: 2024-10-17
 * Time: 21:47
 */

    public class Lorries extends Carries {
        public enum LorryState {
            INUSE, AVAILABLE, MAINTENANCE, LOCKEDAWAY
        }

        private LorryState state;

        public Lorries(Integer id) {
            super(id);
            this.state = LorryState.AVAILABLE;  // 初始状态设置为 AVAILABLE
        }

        public boolean setState(LorryState state) {
            boolean success = false;
            System.out.print("setting state ... ");

            // 当前状态与新状态相同时，不执行任何操作
            if (this.state == state) {
                return success;
            }

            // 根据当前状态做状态转换的限制判断
            switch (this.state) {
                case AVAILABLE:
                    // 从 AVAILABLE 状态不能直接转为 LOCKEDAWAY
                    if (state == LorryState.LOCKEDAWAY) {
                        System.out.println("failed");
                        return success;
                    }
                    break;
                case INUSE:
                    // 从 INUSE 状态不能直接转为 LOCKEDAWAY 或 MAINTENANCE
                    if (state == LorryState.LOCKEDAWAY || state == LorryState.MAINTENANCE) {
                        System.out.println("failed");
                        return success;
                    }
                    break;
                case MAINTENANCE:
                    // 从 MAINTENANCE 状态不能转为 INUSE
                    if (state == LorryState.INUSE) {
                        System.out.println("failed");
                        return success;
                    }
                    break;
                case LOCKEDAWAY:
                    // 从 LOCKEDAWAY 状态不能直接转为 INUSE 或 AVAILABLE
                    if (state == LorryState.INUSE || state == LorryState.AVAILABLE) {
                        System.out.println("failed");
                        return success;
                    }
                    break;
            }

            // 状态转换成功，更新状态并打印
            this.state = state;
            success = true;
            System.out.println(state.toString());
            return success;
        }
    }


