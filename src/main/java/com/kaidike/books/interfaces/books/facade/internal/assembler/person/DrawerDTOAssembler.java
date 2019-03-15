package com.kaidike.books.interfaces.books.facade.internal.assembler.person;

import com.kaidike.books.domain.entities.person.Drawer;
import com.kaidike.books.interfaces.books.facade.dto.person.DrawerDTO;

public class DrawerDTOAssembler {

    public DrawerDTO toDTO(final Drawer drawer) {

        DrawerDTO drawerDTO = new DrawerDTO();

        drawerDTO.setId(drawer.getId());
        drawerDTO.setName(drawer.getName());
        drawerDTO.setPicture(drawer.getPicture());

        return drawerDTO;
    }
}
