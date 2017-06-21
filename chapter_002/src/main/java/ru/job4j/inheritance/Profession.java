package ru.job4j.inheritance;

/**
 * Profession.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 03.06.2017
 */
public class Profession {

    /**
     * Private field name type String.
     */
    private String name;

    /**
     * Private field nameProfession type String.
     */
    private String nameProfession;

    /**
     * Private field workSchedule type double.
     */
    private double workSchedule;

    /**
     * Class constructor.
     */
    public Profession() {
    }

    /**
     * Class constructor.
     *
     * @param name initializes field name String
     * @param nameProfession initializes field nameProfession String
     * @param workSchedule initializes field workSchedule double
     */
    public Profession(String name, String nameProfession, double workSchedule) {
        this.name = name;
        this.nameProfession = nameProfession;
        this.workSchedule = workSchedule;
    }

    /**
     * method initializes name.
     *
     * @param name initializes field name String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * method returns name.
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * method initializes nameProfession.
     *
     * @param nameProfession initializes field nameProfession String
     */
    public void setNameProfession(String nameProfession) {
        this.nameProfession = nameProfession;
    }

    /**
     * method returns nameProfession.
     *
     * @return nameProfession
     */
    public String getNameProfession() {
        return this.nameProfession;
    }

    /**
     * method initializes workSchedule.
     *
     * @param workSchedule initializes field workSchedule double
     */
    public void setWorkSchedule(double workSchedule) {
        this.workSchedule = workSchedule;
    }

    /**
     * method returns workSchedule.
     *
     * @return workSchedule
     */
    public double getWorkSchedule() {
        return this.workSchedule;
    }

    /**
     * method returns String field.
     *
     * @param obj - initializes String field
     * @return String field
     */
    public String workShow(Profession obj) {
        return "Пусто";
    }

    /**
     * method returns String field.
     *
     * @param obj - initializes String field
     * @return String field
     */
    public String work(Profession obj) {
        String st = workShow(obj);
        return st;
    }

    /**
     * method returns String field.
     *
     * @param workSchedule - initializes String field
     * @return String field
     */
    public String workFinish(double workSchedule) {
        return String.format("worked %,.2f hours out of %,.2f", workSchedule, this.workSchedule);
    }
}