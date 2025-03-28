public class OperatingSystemBasics {
    // ref: https://youtu.be/VjPgYcQqqN0?list=PLBlnK6fEyqRiVhbXDGLXDk_OQAeuVcp2O
    // Some basic knowledge of the structure of computer system is required to understand how operating system work.
    // -> A modern general purpose computer consist of one or more CPUs and a number of device controllers connected through a common bus that provides access to shared memory.
    // What is a CPU? Brain of the computer.
    //      We call the box next to our PC as CPU, but it's just a cabinet having motherboard, CD-ROM, Ports etc.
    //      But CPU is just the chip that's embeded in the motherboard
    //      Modern computers can have one or more of the CPU's depending on the power of our machine.

    // 1. Each device controllers is in charge of a specific type of device. (disk controller for disk, USB controller for mouse keyboard and printer etc..., Video controller for monitor is etc)
    // 2. The CPU and the device controllers can execute concurrently, competing for memory cycles. (all of these controllers are connected to a memory controller positioned before memory)
    //          -> When something has to be loaded or executd, it has to be first loaded into main memory (or RAM) - main memory is finite (2GB of ram etc).
    //          -> execute concurrently - means all the devices or controllers can execute all at a same time i.r. we can use keyboard while watching movie but we don't experience lag, because all of em work concurrently.
    //          -> Like in above scenario, point 3 comes into play.
    // 3. To ensure orderly access to the shared memory, a memory controller is provided whose function is to synchronise access to the memory.

    // some important terms:
    // 1. Bootstrap program: -> The initial program that runs when a computer is powered up or rebooted.
    //                       -> It is stored in the ROM. (secondary memory)
    //                       -> It must know how to load the OS and start executing that system.
    //                       -> It must locate and load into memory the OS kernel (kernel is the heart of the OS).
    // 2. Interrupt: -> The occurence of an event is usually signalled by an interrupt from hardware or software.
    //               -> Hardware may trigger an interrupt at any time by sending a signal to the CPU, usually by the way of the system bus.
    // 3. System Call (Monitor call) ->Software may trigger an interrupt by executing a special operation called system call.

    /**
     * 
     * # How CPU Processes 2 + 2

        1. **Instruction in RAM**  
        - The program instruction `ADD 2, 2` is loaded into RAM.  

        2. **CPU Fetches Instruction**  
        - The CPU reads the `ADD 2, 2` instruction from RAM into the **Instruction Register**.  

        3. **Instruction Decoding**  
        - The CPU decodes the instruction to understand that it needs to perform an addition.  

        4. **Loading Data into Registers**  
        - The CPU loads `2` into **Register1** and `2` into **Register2**.  

        5. **Performing the Addition (ALU Execution)**  
        - The **Arithmetic Logic Unit (ALU)** adds the values:  
            ```
            Register3 = Register1 + Register2  (2 + 2 = 4)
            ```

        6. **Storing the Result**  
        - The result `4` is stored in a register for immediate use.  

        7. **Output or Storage**  
        - If required, the result is sent to RAM for later use.  
        - If it's an immediate result, the CPU sends `4` to the output (e.g., terminal, monitor).  

        # Key Takeaways  
        ✅ The CPU is the **only component** that performs computation.  
        ✅ RAM stores instructions & data temporarily.  
        ✅ Registers inside the CPU store values for fast access.  
        ✅ ALU inside the CPU handles arithmetic operations.  

     * 
     */
}
