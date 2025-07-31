

CREATE TABLE `example` (
  `nim` int(10) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jurusan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

ALTER TABLE `example`
  ADD PRIMARY KEY (`nim`);
ALTER TABLE `example`
  MODIFY `nim` int(10) NOT NULL AUTO_INCREMENT;
COMMIT;
