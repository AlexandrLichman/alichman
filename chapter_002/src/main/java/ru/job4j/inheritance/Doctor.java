package ru.job4j.inheritance;

/**
 * Doctor.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 03.06.2017
 */
public class Doctor extends Profession {

    /**
     * Private field listOfPatients array type String.
     */
    private String[] listOfPatients;

    /**
     * Private field diagnosis type String.
     */
    private String diagnosis;

    /**
     * Class constructor.
     */
    public Doctor() {
    }

    /**
     * Class constructor.
     *
     * @param name initializes field name String
     * @param nameProfession initializes field nameProfession String
     * @param workSchedule initializes field workSchedule double
     * @param listOfPatients initializes field listOfPatients String[]
     * @param diagnosis initializes field diagnosis String
     */
    public Doctor(String name, String nameProfession, double workSchedule, String[] listOfPatients, String diagnosis) {
        super(name, nameProfession, workSchedule);
        this.listOfPatients = listOfPatients;
        this.diagnosis = diagnosis;
    }

    /**
     * method initializes listOfPatients.
     *
     * @param listOfPatients initializes field listOfPatients String[]
     */
    public void setListOfPatients(String[] listOfPatients) {
        this.listOfPatients = listOfPatients;
    }

    /**
     * method returns listOfPatients.
     *
     * @return listOfPatients
     */
    public String[] getListOfPatients() {
        return this.listOfPatients;
    }

    /**
     * method initializes diagnosis.
     *
     * @param diagnosis initializes field diagnosis String
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**
     * method returns diagnosis.
     *
     * @return diagnosis
     */
    public String getDiagnosis() {
        return this.diagnosis;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public String workShow(Profession obj) {
        return (getNameProfession() + " " + getName() + " лечит " + obj.getNameProfession() + " " + obj.getName() + " от " + diagnosis);
    }

    /**
     * method returns copyListOfPatients String[].
     *
     * @param listOfPatients - listOfPatients String[]
     * @param diagnosis - diagnosis String
     * @return copyListOfPatients String[] ang diagnosis
     */
    public String[] work(String[] listOfPatients, String diagnosis) {
        String[] copyListOfPatients = new String[listOfPatients.length];
        int copyStudentsLength = copyListOfPatients.length;
        for (int index = 0; index < copyStudentsLength; index++) {
            String st = (getNameProfession() + " " + getName() + " лечит пациента №" + (index + 1) + " " + listOfPatients[index] + " - " + "от " + diagnosis);
            copyListOfPatients[index] = st;
        }
        return copyListOfPatients;
    }
}
