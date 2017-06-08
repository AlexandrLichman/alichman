package ru.job4j.inheritance;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;

/**
 * ArrayDuplicateTest.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 03.06.2017
 */
public class ProfessionTest {

    /**
     * field students type String[].
     */
    private String[] students = {"Оля", "Андрей", "Ваня"};

    /**
     * field teach type Profession.
     */
    private Teacher teach;

    /**
     * field ruler type double[].
     */
    private double[] ruler = new double[4];

    /**
     * field engin type Profession.
     */
    private Engineer engin;

    /**
     * field listOfPatients type String[].
     */
    private String[] listOfPatients = {"Вика", "Сергей", "Валентин", "Вова"};

    /**
     * field doc type Profession.
     */
    private Doctor doc;

    /**
     * Create object.
     */
    @Before
    public void createObject() {
        teach = new Teacher("Михаил", "Учитель", 8.00, students, 3);
        engin = new Engineer("Вадим", "Инженер", 8.00, ruler, 4);
        doc = new Doctor("Игнатий", "Доктор", 8.00, listOfPatients, "ОРЗ");
    }

    /**
     * Test check inheritance Profession teach.
     */
    @Test
    public void checkTeacherMethodWorkOverride() {
        String[] start = {teach.work(engin), teach.work(teach), teach.work(doc)};
        String[] result = {"Учитель Михаил  обучает студента Инженер Вадим", "Не могу учить себя", "Учитель Михаил  обучает студента Доктор Игнатий"};
        assertThat(result, is(start));
    }

    /**
     * Test check inheritance Profession teach.
     */
    @Test
    public void checkTeacherMethodWorkFromProfession() {
        String[] start = teach.work(students, teach.getValuation());
        String[] result = {"Учитель Михаил обучает студента № 1 Оля - получает отметку 3", "Учитель Михаил обучает студента № 2 Андрей - получает отметку 6", "Учитель Михаил обучает студента № 3 Ваня - получает отметку 9"};
        assertThat(result, is(start));
    }

    /**
     * Test check inheritance Profession engin.
     */
    @Test
    public void checkEngineerMethodWorkOverride() {
        String[] start = {engin.work(engin), engin.work(teach), engin.work(doc)};
        String[] result = {"Не могу сдать проект себе", "Проект сдал Инженер Вадим. Принял проект Учитель Михаил.", "Проект сдал Инженер Вадим. Принял проект Доктор Игнатий."};
        assertThat(result, is(start));
    }

    /**
     * Test check inheritance Profession engin.
     */
    @Test
    public void checkEngineerMethodWorkFromProfession() {
        String start = engin.work(ruler, engin.getStructuralEvaluation());
        String result = "введен квадрат оценка 4";
        assertThat(result, is(start));
    }

    /**
     * Test check inheritance Profession doc.
     */
    @Test
    public void checkDoctorMethodWorkOverride() {
        String[] start = {doc.work(engin), doc.work(teach), doc.work(doc)};
        String[] result = {"Доктор Игнатий лечит Инженер Вадим от ОРЗ", "Доктор Игнатий лечит Учитель Михаил от ОРЗ", "Доктор Игнатий лечит Доктор Игнатий от ОРЗ"};
        assertThat(result, is(start));
    }

    /**
     * Test check inheritance Profession doc.
     */
    @Test
    public void checkDoctorMethodWorkFromProfession() {
        String[] start = doc.work(listOfPatients, doc.getDiagnosis());
        String[] result = {"Доктор Игнатий лечит пациента №1 Вика - от ОРЗ", "Доктор Игнатий лечит пациента №2 Сергей - от ОРЗ", "Доктор Игнатий лечит пациента №3 Валентин - от ОРЗ", "Доктор Игнатий лечит пациента №4 Вова - от ОРЗ"};
        assertThat(result, is(start));
    }

}