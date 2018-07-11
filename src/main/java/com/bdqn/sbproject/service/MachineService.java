package com.bdqn.sbproject.service;

import com.bdqn.sbproject.pojo.Machine;

import java.util.List;

public interface MachineService {
    void insertMachine(Machine machine);
    void updateMachine(Machine machine);
    void deleteMachine(Integer id);
    Machine selectMachineById(Integer id);
    List<Machine> selectMachineAll();
}
