public class Paging {
    /*
        🔹 How a Program Executes in Memory
        
        1️⃣ Program Execution Starts

        You run a program (e.g., ./app).
        The OS loads the machine code (binary instructions) into RAM.
       
        2️⃣ Virtual Address Assignment

        The OS assigns virtual memory addresses to the program’s code, variables, and data.
        These virtual addresses do not directly map to RAM yet.
        
        3️⃣ CPU Requests Data

        When the CPU needs to execute an instruction, it tries to access the required memory (e.g., a variable).
        It only knows the virtual address, not the physical address in RAM.
        
        4️⃣ Memory Management Unit (MMU) Translates Address

        The MMU checks the page table to find the corresponding physical address in RAM.
        If the data is in RAM, it retrieves it.
        If not in RAM (page fault) → OS loads the required page from disk (swap space) into RAM.
        
        5️⃣ CPU Processes the Data

        After getting the required data from RAM, the CPU performs computations (e.g., 2+2).
        It then stores results back in RAM or outputs them (e.g., prints on screen).
        
        
        🔹 Key Takeaways
        ✅ OS loads the program’s machine code into RAM and assigns virtual addresses.
        ✅ CPU always accesses memory through virtual addresses.
        ✅ The MMU translates virtual addresses to physical addresses using paging.
        ✅ If the required data is not in RAM, OS loads it from disk (swap memory).

        This is why virtual memory is crucial—it allows programs to run efficiently even when RAM is limited! 🚀

     */
}
