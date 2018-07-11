package com.bdqn.sbproject.service.impl;

import com.bdqn.sbproject.dao.MachineDao;
import com.bdqn.sbproject.pojo.Machine;
import com.bdqn.sbproject.service.MachineService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("machineService")
public class MachineServiceImpl implements MachineService {
    @Resource
    private MachineDao machineDao;

    @Override
    public void insertMachine(Machine machine) {
            this.machineDao.insertMachine(machine);
    }

    @Override
    public void updateMachine(Machine machine) {
            this.machineDao.updateMachine(machine);
    }

    @Override
    public void deleteMachine(Integer id) {
            this.machineDao.deleteMachine(id);
    }

    @Override
    public Machine selectMachineById(Integer id) {
        return this.machineDao.selectMachineById(id);
    }

    @Override
    public List<Machine> selectMachineAll() {
        return this.machineDao.selectMachineAll();
    }
}
