package ru.job4j.encapsulation;

import java.util.Arrays;

/**
 * Tracker.
 *
 * @author A. lichman (alexlich.htc@gmail.com)
 * @version $Id$
 * @since 16.06.2017
 */
public class Tracker {

    /**
     * Private field item type Item[].
     */
    private Item[] item;

    /**
     * Private field calcIntId type int.
     */
    private int calcIntId;

    /**
     * Private field calcCharId type char.
     */
    private char calcCharId;

    /**
     * Class constructor.
     */
    public Tracker() {
        this.item = new Item[100];
        this.calcIntId = 0;
        this.calcCharId = 'a' - 1;
    }

    /**
     * Class constructor.
     *
     * @param item initializes field item Item[]
     */
    public Tracker(Item[] item) {
        this.item = item;
    }

    /**
     * method returns item[].
     *
     * @return item[]
     */
    public Item[] getItem() {
        return this.item;
    }

    /**
     * method initializes item.
     *
     * @param item initializes field item Item[]
     */
    public void setItem(Item[] item) {
        int itemLength = item.length;
        for (int index = 0; index < itemLength; index++) {
            if (item[index] != null) {
                item[index].setId(generateId());
            }
        }
        this.item = item;
    }

    /**
     * method returns calcIntId.
     *
     * @return calcIntId
     */
    public int getCalcIntId() {
        return this.calcIntId;
    }

    /**
     * method initializes calcIntId.
     *
     * @param calcIntId initializes field calcIntId int
     */
    public void setCalcIntId(int calcIntId) {
        this.calcIntId = calcIntId;
    }

    /**
     * method returns calcCharId.
     *
     * @return calcCharId
     */
    public int getCalcCharId() {
        return this.calcCharId;
    }

    /**
     * method initializes calcCharId.
     *
     * @param calcCharId initializes field calcCharId char
     */
    public void setCalcCharId(char calcCharId) {
        this.calcCharId = calcCharId;
    }

    /**
     * method add Item field.
     *
     * @param item - add object
     * @return Item field
     */
    public Item add(Item item) {
        int itemLength = this.item.length;
        int copyIndex = 0;
        for (int index = 0; index < itemLength; index++) {
            if (this.item[index] == null) {
                item.setId(generateId());
                this.item[index] = item;
                copyIndex = index;
                break;
            }
        }
        return this.item[copyIndex];
    }

    /**
     * method add Item id field.
     *
     * @return String field
     */
    private String generateId() {
        String str;
        calcIntId++;
        calcCharId++;
        if (calcCharId > 'z') {
            calcCharId = 'a';
        }
        str = String.format("%d%c", calcIntId, calcCharId);
        return str;
    }

    /**
     * method edit Item field.
     *
     * @param item - edit object
     */
    public void update(Item item) {
        int itemArray = this.item.length;
        for (int index = 0; index < itemArray; index++) {
            if (this.item[index] == null) {
                if (this.item[index].getId().equals(item.getId())) {
                    this.item[index] = item;
                }
            }
        }
    }

    /**
     * method delete Item field.
     *
     * @param item - delete object
     */
    public void delete(Item item) {
        Item itemCopy = new Item();
        int itemArray = this.item.length;
        for (int index = 0; index < itemArray; index++) {
            if (this.item[index] != null) {
                if (item.getId().equals(this.item[index].getId())) {
                    if (index == itemArray - 1) {
                        this.item[index] = null;
                    } else {
                        itemCopy = this.item[index];
                        this.item[index] = this.item[index + 1];
                        this.item[index + 1] = itemCopy;
                    }
                }
            }
        }
    }

    /**
     * method delete null object Item field.
     *
     * @return Item []
     */
    public Item[] findAll() {
        Item itemCopy = new Item();
        int itemLength = this.item.length;
        for (int index = 0; index < itemLength; index++) {
            for (int indexCopy = index; indexCopy < itemLength; indexCopy++) {
                if (this.item[index] == null) {
                    if (this.item[indexCopy] != null) {
                        itemCopy = this.item[index];
                        this.item[index] = this.item[indexCopy];
                        this.item[indexCopy] = itemCopy;
                    }
                }
                while (this.item[itemLength - 1] == null) {
                    itemLength--;
                }
            }
        }
        return Arrays.copyOf(this.item, itemLength);
    }

    /**
     * method find Item name field.
     *
     * @param key - find object name String
     * @return Item[]
     */
    public Item[] findByName(String key) {
        Item[] copyItem = new Item[this.item.length];
        int arrayLength = copyItem.length;
        int calcArray = 0;
        for (int index = 0; index < arrayLength; index++) {
            if (this.item[index] != null) {
                if (this.item[index].getName().equals(key)) {
                    copyItem[calcArray] = this.item[index];
                    calcArray++;
                }
            }
        }
        return Arrays.copyOf(copyItem, calcArray);
    }

    /**
     * method find Item id field.
     *
     * @param id - String id
     * @return Item
     */
    public Item findById(String id) {
        Item itemCopy = new Item();
        int arrayLength = this.item.length;
        for (int index = 0; index < arrayLength; index++) {
            if (this.item[index] != null) {
                if (this.item[index].getId().equals(id)) {
                    itemCopy = this.item[index];
                }
            }
        }
        return itemCopy;
    }
}