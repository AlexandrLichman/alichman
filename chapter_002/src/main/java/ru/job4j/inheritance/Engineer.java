package ru.job4j.inheritance;

/**
 * Engineer.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 03.06.2017
 */
public class Engineer extends Profession {

    /**
     * Private field ruler array type double.
     */
    private double[] ruler;

    /**
     * Private field structuralEvaluation type int.
     */
    private int structuralEvaluation;

    /**
     * Class constructor.
     */
    public Engineer() {
    }

    /**
     * Class constructor.
     *
     * @param name initializes field name String
     * @param nameProfession initializes field nameProfession String
     * @param workSchedule initializes field workSchedule double
     * @param ruler initializes field ruler double[]
     * @param structuralEvaluation initializes field structuralEvaluation int
     */
    public Engineer(String name, String nameProfession, double workSchedule, double[] ruler, int structuralEvaluation) {
        super(name, nameProfession, workSchedule);
        this.ruler = ruler;
        this.structuralEvaluation = structuralEvaluation;
    }

    /**
     * method initializes ruler.
     *
     * @param ruler initializes field ruler double[]
     */
    public void setRuler(double[] ruler) {
        this.ruler = ruler;
    }

    /**
     * method returns ruler.
     *
     * @return ruler
     */
    public double[] getRuler() {
        return this.ruler;
    }

    /**
     * method initializes setStructuralEvaluation.
     *
     * @param structuralEvaluation initializes field setStructuralEvaluation
     * int
     */
    public void setStructuralEvaluation(int structuralEvaluation) {
        this.structuralEvaluation = structuralEvaluation;
    }

    /**
     * method returns structuralEvaluation.
     *
     * @return structuralEvaluation
     */
    public int getStructuralEvaluation() {
        return this.structuralEvaluation;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public String workShow(Profession obj) {
        if (obj instanceof Engineer) {
            return "Не могу сдать проект себе";
        } else {
            return ("Проект сдал " + getNameProfession() + " " + getName() + ". Принял проект " + obj.getNameProfession() + " " + obj.getName() + ".");
        }
    }

    /**
     * method returns String field figure.
     *
     * @param figure - figure double[] initializes ruler double[]
     * @param structuralEvaluation - structuralEvaluation int
     * @return String field figure ang structuralEvaluation
     */
    public String work(double[] figure, int structuralEvaluation) {
        int calc = 0;
        int figureLangth = figure.length;
        for (int index = 0; index < figureLangth; index++) {
            calc++;
        }
        if (calc == 1) {
            return "введена точка" + " оценка " + (structuralEvaluation * 3);
        } else if (calc == 2) {
            return "введен отрезок" + " оценка " + (structuralEvaluation * 2);
        } else if (calc == 3) {
            return "введен треугольник" + " оценка " + (structuralEvaluation * 5);
        } else if (calc == 4) {
            return "введен квадрат" + " оценка " + (structuralEvaluation * 1);
        } else {
            return "нет данных" + " оценка " + (structuralEvaluation * 0);
        }
    }
}
