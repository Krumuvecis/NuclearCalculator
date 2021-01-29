package fuels;

import java.util.HashMap;
import java.util.Map;

public class Decay {

    public static class DecayReaction{
        int delta_A;
        int delta_Z;

        DecayReaction(int A, int Z){
            delta_A = A;
            delta_Z = Z;
        }
    }

    public enum DecayMode{
        Alpha,
        BetaMinus,
        BetaMinusDouble,
        BetaPlus,
        BetaPlusDouble,
        Fission

        // https://en.wikipedia.org/wiki/Radioactive_decay#Types_of_decay
    }

    public static final Map<DecayMode, DecayReaction> ModeReactionMap = new HashMap<>(){{
        put(DecayMode.Alpha, new DecayReaction(-2,-4));
        put(DecayMode.BetaMinus, new DecayReaction(1,0));
        put(DecayMode.BetaMinusDouble, new DecayReaction(2,0));
        put(DecayMode.BetaPlus, new DecayReaction(-1,0));
        put(DecayMode.BetaPlusDouble, new DecayReaction(-2,0));
    }};

}
