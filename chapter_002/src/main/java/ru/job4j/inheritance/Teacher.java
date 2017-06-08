package ru.job4j.inheritance;

/**
 * Teacher.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 03.06.2017
 */
public class Teacher extends Profession {

    /**
     * Private field listOfStudents type String[].
     */
    private String[] listOfStudents;

    /**
     * Private field valuation type int.
     */
    private int valuation;

    /**
     * Class constructor.
     */
    public Teacher() {

    }

    /**
     * Class constructor.
     *
     * @param name initializes field name String
     * @param nameProfession initializes field nameProfession String
     * @param workSchedule initializes field workSchedule double
     * @param listOfStudents initializes field ruler String[]
     * @param valuation initializes field valuation int
     */
    public Teacher(String name, String nameProfession, double workSchedule, String[] listOfStudents, int valuation) {
        super(name, nameProfession, workSchedule);
        this.listOfStudents = listOfStudents;
        this.valuation = valuation;
    }

    /**
     * method initializes listOfStudents.
     *
     * @param listOfStudents initializes field name String[]
     */
    public void setListOfStudents(String[] listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    /**
     * method returns listOfStudents.
     *
     * @return listOfStudents
     */
    public String[] getListOfStudents() {
        return this.listOfStudents;
    }

    /**
     * method initializes valuation.
     *
     * @param valuation initializes field name int
     */
    public void setValuation(int valuation) {
        this.valuation = valuation;
    }

    /**
     * method returns valuation.
     *
     * @return valuation
     */
    public int getValuation() {
        return this.valuation;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public String workShow(Profession obj) {
        if (obj instanceof Teacher) {
            return "Не могу учить себя";
        } else {
            return (getNameProfession() + " " + getName() + " " + " обучает студента " + obj.getNameProfession() + " " + obj.getName());
        }
    }

    /**
     * method returns copyStudents String[].
     *
     * @param students - students String[]
     * @param valuation - valuation int
     * @return copyListOfPatients String[] ang valuation
     */
    public String[] work(String[] students, int valuation) {
        String[] copyStudents = new String[students.length];
        int copyStudentsLength = copyStudents.length;
        for (int index = 0; index < copyStudentsLength; index++) {
            String st = (getNameProfession() + " " + getName() + " обучает студента № " + (index + 1) + " " + students[index] + " - " + "получает отметку" + " " + (valuation + (index * 3)));
            copyStudents[index] = st;
        }
        return copyStudents;
    }
}