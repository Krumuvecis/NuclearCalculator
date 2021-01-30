package periodicTable;

import java.util.*;

public class PeriodicTable {

    public static class Element{
        public String symbol, name;
        public Map<Integer, Isotope> isotopeList;

        Element(String _symbol,
                String _name,
                Map<Integer, Isotope> _isotopeList){

            symbol = _symbol;
            name = _name;
            isotopeList = _isotopeList;
        }
    }

    public static class Isotope{
        public Double mass;
        public Double halfLife;
        public List<Decay.DecayType> decayModeList;

        Isotope(Double _mass,
                Double _halfLife,
                List<Decay.DecayType> _decayModeList){

            mass = _mass;
            halfLife = _halfLife;
            decayModeList = _decayModeList;
        }
    }

    static final int secondsInHour = 3600;
    static final int secondsInDay = 24 * secondsInHour;
    static final int secondsInYear = 365 * secondsInDay;

    public static final Map<Integer, Element> periodicTable = new HashMap<>(){{
        // Period 1

        put(1, new Element("H", "Hydrogen", new HashMap<>(){{
            put(1, new Isotope(1.00782503224, null, null));
            put(2, new Isotope(2.01410177811, null, null));
            put(3, new Isotope(3.01604928199, 12.32 * secondsInYear, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaMinus);
                }}));
            }}));
            put(4, new Isotope(4.02643, 1.39e-22, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.NeutronEmission);
                }}));
            }}));
            put(5, new Isotope(5.03531, 9.1e-22, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.NeutronEmission);
                    add(Decay.DecayMode.NeutronEmission);
                }}));
            }}));
            put(6, new Isotope(6.04496, 2.90e-22, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.NeutronEmission);
                    add(Decay.DecayMode.NeutronEmission);
                    add(Decay.DecayMode.NeutronEmission);
                }}));
            }}));
            put(7, new Isotope(7.05275, 2.3e-23, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.NeutronEmission);
                    add(Decay.DecayMode.NeutronEmission);
                    add(Decay.DecayMode.NeutronEmission);
                    add(Decay.DecayMode.NeutronEmission);
                }}));
            }}));
        }}));
        put(2, new Element("He", "Helium", new HashMap<>(){{
            put(2, new Isotope(2.015894, 10e-9, new ArrayList<>(){{
                add(new Decay.DecayType(0.9999, new ArrayList<>(){{
                    add(Decay.DecayMode.ProtonEmission);
                }}));
                add(new Decay.DecayType(0.0001, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaPlus);
                }}));
            }}));
            put(3, new Isotope(3.01602932265, null, null));
            put(4, new Isotope(4.00260325413, null, null));
            put(5, new Isotope(5.012057, 700e-24, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.NeutronEmission);
                }}));
            }}));
            put(6, new Isotope(6.01888589, 806.92e-3, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaMinus);
                }}));
            }}));
            put(7, new Isotope(7.027991, 2.51e-21, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.NeutronEmission);
                }}));
            }}));
            put(8, new Isotope(8.03393439, 119.1e-3, new ArrayList<>(){{
                add(new Decay.DecayType(0.83, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaMinus);
                }}));
                add(new Decay.DecayType(0.161, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaMinus);
                    add(Decay.DecayMode.NeutronEmission);
                }}));
                add(new Decay.DecayType(0.009, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaMinus);
                    add(Decay.DecayMode.Fission);
                }}));
            }}));
            put(9, new Isotope(9.04395, 2.5e-21, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.NeutronEmission);
                }}));
            }}));
            put(10, new Isotope(10.05282, 3.1e-21, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.NeutronEmission);
                    add(Decay.DecayMode.NeutronEmission);
                }}));
            }}));
        }}));

        // Period 2

        put(3, new Element("Li", "Lithium", new HashMap<>(){{
            put(4, new Isotope(4.02719, 91e-24, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.ProtonEmission);
                }}));
            }}));
            put(5, new Isotope(5.01254, 370e-24, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.ProtonEmission);
                }}));
            }}));
            put(6, new Isotope(6.0151228874, null, null));
            put(7, new Isotope(7.016003437, null, null));
            put(8, new Isotope(8.02248625, 839.40e-3, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaMinus);
                }}));
            }}));
            put(9, new Isotope(9.02679019, 178.3e-3, new ArrayList<>(){{
                add(new Decay.DecayType(0.508, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaMinus);
                    add(Decay.DecayMode.NeutronEmission);
                }}));
                add(new Decay.DecayType(0.492, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaMinus);
                }}));
            }}));
            put(10, new Isotope(10.035483, 2.0e-21, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.NeutronEmission);
                }}));
            }}));
            put(11, new Isotope(11.0437236, 8.75e-3, new ArrayList<>(){{
                add(new Decay.DecayType(0.863, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaMinus);
                    add(Decay.DecayMode.NeutronEmission);
                }}));
                add(new Decay.DecayType(0.05978, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaMinus);
                }}));
                add(new Decay.DecayType(0.041, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaMinus);
                    add(Decay.DecayMode.NeutronEmission);
                    add(Decay.DecayMode.NeutronEmission);
                }}));
                add(new Decay.DecayType(0.019, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaMinus);
                    add(Decay.DecayMode.NeutronEmission);
                    add(Decay.DecayMode.NeutronEmission);
                    add(Decay.DecayMode.NeutronEmission);
                }}));
                add(new Decay.DecayType(0.017, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaMinus);
                    add(Decay.DecayMode.Alpha);
                }}));
                add(new Decay.DecayType(0.00013, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaMinus);
                    add(Decay.DecayMode.Fission);
                }}));
                add(new Decay.DecayType(0.000009, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaMinus);
                    add(Decay.DecayMode.Fission);
                }}));
            }}));
            put(12, new Isotope(12.05261, 10e-9, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.NeutronEmission);
                }}));
            }}));
            put(13, new Isotope(13.06117, 3.3e-21, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.NeutronEmission);
                    add(Decay.DecayMode.NeutronEmission);
                }}));
            }}));
        }}));
        put(4, new Element("Be", "Beryllium", new HashMap<>(){{
            put(6, new Isotope(6.019726, 5.0e-21, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.ProtonEmission);
                    add(Decay.DecayMode.ProtonEmission);
                }}));
            }}));
            put(7, new Isotope(7.01692872, 53.22 * secondsInDay, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaPlus);
                }}));
            }}));
            put(8, new Isotope(8.00530510, 8.19e-17, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.Alpha);
                }}));
            }}));
            put(9, new Isotope(9.01218307, null, null));
            put(10, new Isotope(10.01353470, 1.51e+6 * secondsInYear, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaMinus);
                }}));
            }}));
            put(11, new Isotope(11.02166108, 13.76, new ArrayList<>(){{
                add(new Decay.DecayType(0.971, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaMinus);
                }}));
                add(new Decay.DecayType(0.029, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaMinus);
                    add(Decay.DecayMode.Alpha);
                }}));
            }}));
            put(12, new Isotope(12.0269221, 21.50e-3, new ArrayList<>(){{
                add(new Decay.DecayType(0.995, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaMinus);
                }}));
                add(new Decay.DecayType(0.005, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaMinus);
                    add(Decay.DecayMode.NeutronEmission);
                }}));
            }}));
            put(13, new Isotope(13.036135, 1.0e-21, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.NeutronEmission);
                }}));
            }}));
            put(14, new Isotope(14.04289, 4.35e-3, new ArrayList<>(){{
                add(new Decay.DecayType(0.98, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaMinus);
                    add(Decay.DecayMode.NeutronEmission);
                }}));
                add(new Decay.DecayType(0.012, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaMinus);
                }}));
                add(new Decay.DecayType(0.008, new ArrayList<>(){{
                    add(Decay.DecayMode.BetaMinus);
                    add(Decay.DecayMode.NeutronEmission);
                    add(Decay.DecayMode.NeutronEmission);
                }}));
            }}));
            put(15, new Isotope(15.05349, 7.9e-22, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.NeutronEmission);
                }}));
            }}));
            put(16, new Isotope(16.06167, 6.5e-22, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.NeutronEmission);
                    add(Decay.DecayMode.NeutronEmission);
                }}));
            }}));
        }}));
        put(5, new Element("B", "Boron", new HashMap<>(){{
            put(11, null);
        }}));
        put(6, new Element("C", "Carbon", new HashMap<>(){{
            put(12, null);
        }}));
        put(7, new Element("N", "Nitrogen", new HashMap<>(){{
            put(14, null);
        }}));
        put(8, new Element("O", "Oxygen", new HashMap<>(){{
            put(16, null);
        }}));
        put(9, new Element("F", "Fluorine", new HashMap<>(){{
            put(19, null);
        }}));
        put(10, new Element("Ne", "Neon", new HashMap<>(){{
            put(20, null);
        }}));

        // Period 3

        put(11, new Element("Na", "Sodium", new HashMap<>(){{
            put(23, null);
        }}));
        put(12, new Element("Mg", "Magnesium", new HashMap<>(){{
            put(24, null);
        }}));
        put(13, new Element("Al", "Aluminium", new HashMap<>(){{
            put(27, null);
        }}));
        put(14, new Element("Si", "Silicon", new HashMap<>(){{
            put(28, null);
        }}));
        put(15, new Element("P", "Phosphorus", new HashMap<>(){{
            put(31, null);
        }}));
        put(16, new Element("S", "Sulphur", new HashMap<>(){{
            put(32, null);
        }}));
        put(17, new Element("Cl", "Chlorine", new HashMap<>(){{
            put(35, null);
            put(36, null);
        }}));
        put(18, new Element("Ar", "Argon", new HashMap<>(){{
            put(40, null);
        }}));

        //Period 4

        put(19, new Element("K", "Potassium", new HashMap<>(){{
            put(39, null);
        }}));
        put(20, new Element("Ca", "Calcium", new HashMap<>(){{
            put(40, null);
        }}));
        put(21, new Element("Sc", "Scandium", new HashMap<>(){{
            put(45, null);
        }}));
        put(22, new Element("Ti", "Titanium", new HashMap<>(){{
            put(48, null);
        }}));
        put(23, new Element("V", "Vanadium", new HashMap<>(){{
            put(51, null);
        }}));
        put(24, new Element("Cr", "Chromium", new HashMap<>(){{
            put(52, null);
        }}));
        put(25, new Element("Mn", "Manganese", new HashMap<>(){{
            put(55, null);
        }}));
        put(26, new Element("Fe", "Iron", new HashMap<>(){{
            put(56, null);
        }}));
        put(27, new Element("Co", "Cobalt", new HashMap<>(){{
            put(59, null);
        }}));
        put(28, new Element("Ni", "Nickel", new HashMap<>(){{
            put(59, null);
        }}));
        put(29, new Element("Cu", "Copper", new HashMap<>(){{
            put(64, null);
        }}));
        put(30, new Element("Zn", "Zinc", new HashMap<>(){{
            put(65, null);
        }}));
        put(31, new Element("Ga", "Gallium", new HashMap<>(){{
            put(70, null);
        }}));
        put(32, new Element("Ge", "Germanium", new HashMap<>(){{
            put(73, null);
        }}));
        put(33, new Element("As", "Arsenic", new HashMap<>(){{
            put(75, null);
        }}));
        put(34, new Element("Se", "Selenium", new HashMap<>(){{
            put(79, null);
        }}));
        put(35, new Element("Br", "Bromine", new HashMap<>(){{
            put(80, null);
        }}));
        put(36, new Element("Kr", "Krypton", new HashMap<>(){{
            put(84, null);
        }}));

        //Period 5

        put(37, new Element("Rb", "Rubidium", new HashMap<>(){{
            put(85, null);
        }}));
        put(38, new Element("Sr", "Strontium", new HashMap<>(){{
            put(88, null);
        }}));
        put(39, new Element("Y", "Yttrium", new HashMap<>(){{
            put(89, null);
        }}));
        put(40, new Element("Zr", "Zirconium", new HashMap<>(){{
            put(91, null);
        }}));
        put(41, new Element("Nb", "Niobium", new HashMap<>(){{
            put(93, null);
        }}));
        put(42, new Element("Mo", "Molybdenum", new HashMap<>(){{
            put(96, null);
        }}));
        put(43, new Element("Tc", "Technetium", new HashMap<>(){{
            put(98, null);
        }}));
        put(44, new Element("Ru", "Ruthenium", new HashMap<>(){{
            put(101, null);
        }}));
        put(45, new Element("Rh", "Rhodium", new HashMap<>(){{
            put(103, null);
        }}));
        put(46, new Element("Pd", "Palladium", new HashMap<>(){{
            put(106, null);
        }}));
        put(47, new Element("Ag", "Silver", new HashMap<>(){{
            put(108, null);
        }}));
        put(48, new Element("Cd", "Cadmium", new HashMap<>(){{
            put(112, null);
        }}));
        put(49, new Element("In", "Indium", new HashMap<>(){{
            put(115, null);
        }}));
        put(50, new Element("Sn", "Tin", new HashMap<>(){{
            put(119, null);
        }}));
        put(51, new Element("Sb", "Antimony", new HashMap<>(){{
            put(122, null);
        }}));
        put(52, new Element("Te", "Tellurium", new HashMap<>(){{
            put(128, null);
        }}));
        put(53, new Element("I", "Iodine", new HashMap<>(){{
            put(127, null);
        }}));
        put(54, new Element("Xe", "Xenon", new HashMap<>(){{
            put(131, null);
        }}));

        //Period 6

        put(55, new Element("Cs", "Caesium", new HashMap<>(){{
            put(133, null);
        }}));
        put(56, new Element("Ba", "Barium", new HashMap<>(){{
            put(137, null);
        }}));
        put(57, new Element("La", "Lanthanum", new HashMap<>(){{
            put(139, null);
        }}));
        put(58, new Element("Ce", "Cerium", new HashMap<>(){{
            put(140, null);
        }}));
        put(59, new Element("Pr", "Praseodymium", new HashMap<>(){{
            put(141, null);
        }}));
        put(60, new Element("Nd", "Neodymium", new HashMap<>(){{
            put(144, null);
        }}));
        put(61, new Element("Pm", "Promethium", new HashMap<>(){{
            put(145, null);
        }}));
        put(62, new Element("Sm", "Samarium", new HashMap<>(){{
            put(150, null);
        }}));
        put(63, new Element("Eu", "Europium", new HashMap<>(){{
            put(152, null);
        }}));
        put(64, new Element("Gd", "Gadolinium", new HashMap<>(){{
            put(157, null);
        }}));
        put(65, new Element("Tb", "Terbium", new HashMap<>(){{
            put(159, null);
        }}));
        put(66, new Element("Dy", "Dysprosium", new HashMap<>(){{
            put(162, null);
            put(163, null);
        }}));
        put(67, new Element("Ho", "Holmium", new HashMap<>(){{
            put(165, null);
        }}));
        put(68, new Element("Er", "Erbium", new HashMap<>(){{
            put(167, null);
        }}));
        put(69, new Element("Tm", "Thulium", new HashMap<>(){{
            put(169, null);
        }}));
        put(70, new Element("Yb", "Ytterbium", new HashMap<>(){{
            put(173, null);
        }}));
        put(71, new Element("Lu", "Lutetium", new HashMap<>(){{
            put(175, null);
        }}));
        put(72, new Element("Hf", "Hafnium", new HashMap<>(){{
            put(178, null);
        }}));
        put(73, new Element("Ta", "Tantalum", new HashMap<>(){{
            put(181, null);
        }}));
        put(74, new Element("W", "Tungsten", new HashMap<>(){{
            put(184, null);
        }}));
        put(75, new Element("Re", "Rhenium", new HashMap<>(){{
            put(186, null);
        }}));
        put(76, new Element("Os", "Osmium", new HashMap<>(){{
            put(190, null);
        }}));
        put(77, new Element("Ir", "Iridium", new HashMap<>(){{
            put(192, null);
        }}));
        put(78, new Element("Pt", "Platinum", new HashMap<>(){{
            put(195, null);
        }}));
        put(79, new Element("Au", "Gold", new HashMap<>(){{
            put(197, null);
        }}));
        put(80, new Element("Hg", "Mercury", new HashMap<>(){{
            put(201, null);
        }}));
        put(81, new Element("Tl", "Thallium", new HashMap<>(){{
            put(204, null);
        }}));
        put(82, new Element("Pb", "Lead", new HashMap<>(){{
            put(207, null);
        }}));
        put(83, new Element("Bi", "Bismuth", new HashMap<>(){{
            put(209, null);
        }}));
        put(84, new Element("Po", "Polonium", new HashMap<>(){{
            put(209, null);
        }}));
        put(85, new Element("At", "Astatine", new HashMap<>(){{
            put(210, null);
        }}));
        put(86, new Element("Rn", "Radon", new HashMap<>(){{
            put(222, null);
        }}));

        //Period 7

        put(87, new Element("Fr", "Francium", new HashMap<>(){{
            put(223, null);
        }}));
        put(88, new Element("Ra", "Radium", new HashMap<>(){{
            put(226, null);
        }}));
        put(89, new Element("Ac", "Actinium", new HashMap<>(){{
            put(227, null);
        }}));
        put(90, new Element("Th", "Thorium", new HashMap<>(){{
            put(232, null);
        }}));
        put(91, new Element("Pa", "Protactinium", new HashMap<>(){{
            put(231, null);
        }}));
        put(92, new Element("U", "Uranium", new HashMap<>(){{
            put(238, null);
        }}));
        put(93, new Element("Np", "Neptunium", new HashMap<>(){{
            put(237, null);
        }}));
        put(94, new Element("Pu", "Plutonium", new HashMap<>(){{
            put(244, null);
        }}));
        put(95, new Element("Am", "Americium", new HashMap<>(){{
            put(243, null);
        }}));
        put(96, new Element("Cm", "Curium", new HashMap<>(){{
            put(247, null);
        }}));
        put(97, new Element("Bk", "Berkelium", new HashMap<>(){{
            put(247, null);
        }}));
        put(98, new Element("Cf", "Californium", new HashMap<>(){{
            put(251, null);
        }}));
        put(99, new Element("Es", "Einsteinium", new HashMap<>(){{
            put(252, null);
        }}));
        put(100, new Element("Fm", "Fermium", new HashMap<>(){{
            put(257, null);
        }}));
        put(101, new Element("Md", "Mendelevium", new HashMap<>(){{
            put(258, null);
        }}));
        put(102, new Element("No", "Nobelium", new HashMap<>(){{
            put(259, null);
        }}));
        put(103, new Element("Lr", "Lawrencium", new HashMap<>(){{
            put(266, null);
        }}));
        put(104, new Element("Rf", "Rutherfordium", new HashMap<>(){{
            put(267, null);
        }}));
        put(105, new Element("Db", "Dubnium", new HashMap<>(){{
            put(268, null);
        }}));
        put(106, new Element("Sg", "Seaborgium", new HashMap<>(){{
            put(269, null);
        }}));
        put(107, new Element("Bh", "Bohrium", new HashMap<>(){{
            put(270, null);
        }}));
        put(108, new Element("Hs", "Hassium", new HashMap<>(){{
            put(270, null);
        }}));
        put(109, new Element("Mt", "Meitnerium", new HashMap<>(){{
            put(278, null);
        }}));
        put(110, new Element("Ds", "Darmstadtium", new HashMap<>(){{
            put(281, null);
        }}));
        put(111, new Element("Rg", "Roentgenium", new HashMap<>(){{
            put(282, null);
        }}));
        put(112, new Element("Cn", "Copernicum", new HashMap<>(){{
            put(285, null);
        }}));
        put(113, new Element("Nh", "Nihonium", new HashMap<>(){{
            put(286, null);
        }}));
        put(114, new Element("Fl", "Flerovium", new HashMap<>(){{
            put(289, null);
        }}));
        put(115, new Element("Mc", "Moscovium", new HashMap<>(){{
            put(290, null);
        }}));
        put(116, new Element("Lv", "Livermorium", new HashMap<>(){{
            put(293, null);
        }}));
        put(117, new Element("Ts", "Tennessine", new HashMap<>(){{
            put(294, null);
        }}));
        put(118, new Element("Og", "Oganesson", new HashMap<>(){{
            put(294, null);
        }}));

        // Period 8 - hypothetical

        /*put(0, new Element("", "", new HashMap<>(){{
            put(0,  new Isotope(null, null, new ArrayList<>(){{
                add(new Decay.DecayType(1.0, new ArrayList<>(){{
                    add(Decay.DecayMode.Fission);
                }}));
            }}));
        }}));*/

    }};

}
