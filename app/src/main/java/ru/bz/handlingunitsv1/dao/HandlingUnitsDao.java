package ru.bz.handlingunitsv1.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import ru.bz.handlingunitsv1.models.HandlingUnit;

@Dao
public interface HandlingUnitsDao {

    @Query("SELECT * FROM handling_units")
    List<HandlingUnit> getAllHandlingUnits();

    @Insert
    void insertHandlingUnit(HandlingUnit handlingUnit);

    @Delete
    void deleteHandlingUnit(HandlingUnit handlingUnit);

    @Query("DELETE FROM handling_units")
    void deleteAllHandlingUnits();
}
