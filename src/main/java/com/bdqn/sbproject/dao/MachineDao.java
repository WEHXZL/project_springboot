package com.bdqn.sbproject.dao;

import com.bdqn.sbproject.pojo.Machine;

import java.util.List;

public interface MachineDao {
    void insertMachine(Machine machine);
    void updateMachine(Machine machine);
    void deleteMachine(Integer id);
    Machine selectMachineById(Integer id);
    List<Machine> selectMachineAll();

}
