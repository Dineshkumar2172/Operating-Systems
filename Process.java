public class Process {
    /*
        🔹 How a Process is Created and Runs
        1️⃣ Program is Stored in Disk

        A program (e.g., app.exe, ./myapp) is just a file stored on disk.
        It’s just inactive data until executed.

        2️⃣ OS Loads the Program into RAM

        When you run the program, the OS loads its machine code into RAM.
        OS assigns virtual memory addresses for the program’s code, stack, and heap.
       
        3️⃣ A Process is Created

        The OS creates a process with a unique Process ID (PID).
        The process gets its own virtual address space, independent of other processes.
        
        4️⃣ CPU Starts Executing Instructions

        The CPU fetches the first instruction (from virtual memory).
        The MMU translates virtual addresses → physical addresses to access RAM.
        The CPU executes the instruction and moves to the next one.
        
        5️⃣ Process Runs Until Completion or Termination

        The process keeps running as long as CPU time is allocated.
        If the process needs more memory, the OS may allocate more pages in RAM.
        If RAM is full, some memory pages are swapped to disk (swap memory).
        
        6️⃣ Process Exits

        Once the program finishes execution (or is terminated), the OS deallocates its memory.
        The process is removed from RAM, and its PID is freed.
        
        🔹 Key Takeaways
        ✅ A program is just a file on disk, but a process is an active execution of that program.
        ✅ The OS loads the program into RAM and assigns virtual memory addresses.
        ✅ The CPU executes the process by accessing instructions via virtual memory.
        ✅ The MMU translates virtual memory to physical memory (RAM).
        ✅ When the process exits, the OS cleans up its memory and resources.

        This is the foundation of process management in an OS! 🔥
     */
}
