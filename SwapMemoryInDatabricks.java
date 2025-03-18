public class SwapMemoryInDatabricks {
    /**
     *  🔹 Databricks Swap Memory - Summary
        1️⃣ What is Swap Memory?
            Swap memory is disk space used as temporary RAM when physical RAM is full.
            OS moves inactive or less-used memory pages from RAM to disk (swap space) to free up RAM.
            Since disk is much slower than RAM, swap usage can slow down performance.
        
        2️⃣ How Swap Works in Databricks?
            Job runs in RAM – Data and computations are stored in RAM for fast access.
            RAM fills up – If memory demand exceeds available RAM, OS needs more space.
            Swap is used – OS moves some data from RAM to disk (swap space).
            CPU accesses swapped data (slow) – If the swapped data is needed again, OS moves it back to RAM, causing delays.

        3️⃣ What Does "Swap Memory" Actually Measure?
            Swap memory = Amount of data currently stored on disk due to RAM overflow.
            It does not track the total amount of data moved back and forth.
            Example:
            If 2GB is moved to swap, swap usage = 2GB.
            If 1GB is moved back to RAM, swap usage = 1GB.

        4️⃣ Why is Swap Memory Important in Databricks?
            Databricks handles large datasets in RAM-intensive Spark jobs.
            If RAM runs out, excessive swap usage causes slow performance (disk is slower).
            Monitoring swap helps detect memory bottlenecks and improve efficiency.
           
        5️⃣ How to Reduce Swap Usage in Databricks?
            ✅ Increase RAM – More physical memory = Less swap usage.
            ✅ Optimize Queries – Avoid loading large datasets into memory all at once.
            ✅ Use Efficient Data Formats – Prefer Parquet/ORC over CSV.
            ✅ Tune Spark Configurations – Set spark.sql.shuffle.partitions properly.

        🔹 Key Takeaways
            ✅ Swap memory = Data temporarily stored on disk due to RAM overflow.
            ✅ More swap usage = More performance issues (disk is much slower than RAM).
            ✅ Databricks users should monitor and minimize swap usage to avoid slowdowns.
     */

    /*
        🔹 How spark.sql.shuffle.partitions Helps Reduce Swap Memory Usage
        The spark.sql.shuffle.partitions setting controls the number of partitions used during shuffle operations in Spark.

        1️⃣ What Happens When Shuffle Partitions Are Too High?
            Spark splits data into many small partitions for parallel processing.
            Each partition requires memory, and too many partitions can lead to:
                ✅ High memory usage.
                ✅ More spill to disk (swap usage) when RAM is full.
                ✅ Increased shuffle overhead (I/O, CPU).

        2️⃣ What Happens When Shuffle Partitions Are Too Low?
            Few partitions = Less parallelism
            Some executors get overloaded with too much data.
            This can cause out-of-memory (OOM) errors, leading to excessive swap usage when Spark spills data to disk.
        
        3️⃣ How spark.sql.shuffle.partitions Helps?
            Optimizing this setting ensures that shuffle operations use memory efficiently without excessive disk swap or memory overloading.
                ✅ Reducing partitions (if too high) → Lowers memory overhead, reducing swap usage.
                ✅ Increasing partitions (if too low) → Prevents executors from running out of memory, reducing disk spills.

        4️⃣ Example: Before & After Optimization
            🔹 Before Optimization (spark.sql.shuffle.partitions = 200)
                    200 shuffle partitions → Too many small tasks → High memory usage → Spill to disk (swap).
            🔹 After Optimization (spark.sql.shuffle.partitions = 50)
                    50 shuffle partitions → Less memory overhead → Less swap usage → Faster execution.
        
        🔹 Summary: Why This Matters for Swap Usage in Databricks?
            ✅ Right-sized shuffle partitions → Less memory overhead.
            ✅ Less memory overflow → Less swap usage (fewer disk spills).
            ✅ Faster execution & better performance.

💡       Best Practice: Start with spark.sql.shuffle.partitions = num_cores * 2 and adjust based on performance.

    */
}
