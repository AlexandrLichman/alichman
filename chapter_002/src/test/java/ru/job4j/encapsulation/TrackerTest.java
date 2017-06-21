package ru.job4j.encapsulation;

import static org.hamcrest.core.Is.is;
import org.junit.After;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertThat;

/**
 * TrackerTest.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 16.06.2017
 */
public class TrackerTest {

    /**
     * field tracker type Tracker.
     */
    private Tracker tracker;

    /**
     * field item type Item[].
     */
    private Item[] item;

    /**
     * Create object.
     */
    @Before
    public void setUp() {
        tracker = new Tracker();
        int itemLength = tracker.getItem().length;
        item = new Item[itemLength];
        int calc = 1;
        for (int index = 0; index < itemLength; index++) {
            item[index] = new Item(String.format("test%d", calc), "testDescription");
            calc++;
        }
    }

    /**
     * rest object.
     */
    @After
    public void tearDown() {
        tracker = null;
        item = null;
    }

    /**
     * Test check add Item object.
     */
    @Test
    public void testAdd() {
        Item itemResult = tracker.add(item[5]);
        assertThat(tracker.getItem()[0], is(itemResult));
    }

    /**
     * Test check update Item object of class Tracker.
     */
    @Test
    public void testUpdate() {
        tracker.setItem(item);
        Item itemResult = new Item("name test", "desc");
        itemResult.setId("1a");
        tracker.update(itemResult);
        assertThat(tracker.getItem()[0].getId(), is(itemResult.getId()));
    }

    /**
     * Test check delete Item, of class Tracker.
     */
    @Test
    public void testDelete() {
        tracker.setItem(item);
        Item itemResult = new Item("name test", "desc");
        itemResult.setId("65m");
        tracker.delete(itemResult);
        assertNull(tracker.getItem()[99]);
    }

    /**
     * Test of findAll method, of class Tracker.
     */
    @Test
    public void testFindAll() {
        for (int index = 0; index < this.item.length; index++) {
            if (index + 1 == 4) {
                this.item[index] = null;
            }
            if (index + 1 == 2) {
                this.item[index] = null;
            }
            if (index + 1 == 8) {
                this.item[index] = null;
            }
            if (index + 1 == 56) {
                this.item[index] = null;
            }
        }
        tracker.setItem(this.item);
        int result = tracker.findAll().length;
        assertThat(result, is(96));
    }

    /**
     * Test of findByName method, of class Tracker.
     */
    @Test
    public void testFindByName() {
        tracker.setItem(item);
        String key = "test56";
        Item[] it = tracker.findByName(key);
        String result = it[0].getName();
        assertThat(result, is(key));
    }

    /**
     * Test of findById method, of class Tracker.
     */
    @Test
    public void testFindById() {
        tracker.setItem(item);
        String key = "20t";
        Item it = tracker.findById(key);
        String result = it.getId();
        assertThat(result, is(key));
    }
}