import React from 'react';
import styles from '../Styles/CohortDetails.module.css';

const CohortDetails = ({ name, trainer, status }) => {
  const statusStyle = {
    color: status.toLowerCase() === 'ongoing' ? 'green' : 'blue'
  };

  return (
    <div className={styles.box}>
      <h3 style={statusStyle}>{name}</h3>
      <dl>
        <dt>Trainer:</dt>
        <dd>{trainer}</dd>
        <dt>Status:</dt>
        <dd>{status}</dd>
      </dl>
    </div>
  );
};

export default CohortDetails;
