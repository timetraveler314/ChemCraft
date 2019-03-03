package io.github.timetraveler314.chemcraft.inventory;

import io.github.timetraveler314.chemcraft.item.ItemLoader;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerDistillatingMachine extends Container {

    private ItemStackHandler items = new ItemStackHandler(8);

    public ContainerDistillatingMachine(EntityPlayer player)
    {
        super();

        this.addSlotToContainer(new SlotItemHandler(items, 0, 16, 18)); // Water input
        this.addSlotToContainer(new SlotItemHandler(items, 1, 16, 54)); // fuel
        this.addSlotToContainer(new SlotItemHandler(items, 2, 74, 53)); // Cooling ater input
        this.addSlotToContainer(new SlotItemHandler(items, 3, 107, 10)); // Cooling water output
        this.addSlotToContainer(new SlotItemHandler(items, 4, 119, 53)); // Water output
        this.addSlotToContainer(new SlotItemHandler(items, 5, 151, 11)); // outputs
        this.addSlotToContainer(new SlotItemHandler(items, 6, 151, 34)); // outputs
        this.addSlotToContainer(new SlotItemHandler(items, 7, 151, 56)); // outputs

        //PlayerInv
        for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(player.inventory, j + i * 9 + 7, 8 + j * 18, 84 + i * 18));
            }
        }

        for (int i = 0; i < 9; ++i)
        {
            this.addSlotToContainer(new Slot(player.inventory, i, 8 + i * 18, 142));
        }
    }

    public boolean canInteractWith(EntityPlayer playerIn)
    {
        return true;
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
    {
        return null;
    }
}
