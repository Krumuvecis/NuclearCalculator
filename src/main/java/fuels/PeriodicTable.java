package fuels;

import java.util.Map;
import java.util.HashMap;

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
        public double mass;
        public double halfLife;
        public Map<Decay.DecayMode, Double> decayModeDistribution;

        Isotope(Double _mass,
                Double _halfLife,
                Map<Decay.DecayMode, Double> _decayModeDistribution){

            mass = _mass;
            halfLife = _halfLife;
            decayModeDistribution = _decayModeDistribution;
        }
    }

    public static final Map<Integer, Element> periodicTable = new HashMap<>(){{
        // Period 1

        put(1, new Element("H", "Hydrogen", new HashMap<>(){{
            put(1, null);
            put(2, null);
            put(3, null);
        }}));
        put(2, new Element("He", "Helium", new HashMap<>(){{
            put(4, null);
        }}));

        // Period 2

        put(3, new Element("Li", "Lithium", new HashMap<>(){{
            put(7, null);
        }}));
        put(4, new Element("Be", "Beryllium", new HashMap<>(){{
            put(9, null);
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
        put(80, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(81, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(82, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(83, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(84, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(85, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(86, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));

        //Period 7

        put(87, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(88, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(89, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(90, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(91, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(92, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(93, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(94, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(95, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(96, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(97, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(98, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(99, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(100, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(101, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(102, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(103, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(104, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(105, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(106, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(107, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(108, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(109, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(110, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(111, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(112, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(113, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(114, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(115, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(116, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(117, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));
        put(118, new Element("", "", new HashMap<>(){{
            put(0, null);
        }}));

        // Period 8 - hypothetical

    }};

}
