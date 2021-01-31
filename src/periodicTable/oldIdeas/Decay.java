package periodicTable.oldIdeas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Decay {

    public static class DecayReaction{
        int delta_A; // mass number
        int delta_Z; // atomic number

        DecayReaction(int A, int Z){
            delta_A = A;
            delta_Z = Z;
        }
    }

    public enum DecayMode{
        Alpha,
        BetaMinus,
        BetaPlus,
        NeutronEmission,
        ProtonEmission,

        Fission

        // https://en.wikipedia.org/wiki/Radioactive_decay#Types_of_decay
    }

    public static final Map<DecayMode, DecayReaction> ModeReactionMap = new HashMap<>(){{
        put(DecayMode.Alpha, new DecayReaction(-4,-2));
        put(DecayMode.BetaMinus, new DecayReaction(0,1));
        put(DecayMode.BetaPlus, new DecayReaction(0,-1));
        put(DecayMode.NeutronEmission, new DecayReaction(-1,0));
        put(DecayMode.ProtonEmission, new DecayReaction(-1,-1));
    }};

    public static class DecayType{
        public double probability;
        public List<DecayMode> modeCombination;

        DecayType(double _probability,
                  List<DecayMode> _modeCombination){

            probability = _probability;
            modeCombination = _modeCombination;
        }
    }

}
