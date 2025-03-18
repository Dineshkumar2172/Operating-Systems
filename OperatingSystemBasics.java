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
}
