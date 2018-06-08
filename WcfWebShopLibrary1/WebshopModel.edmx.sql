
-- --------------------------------------------------
-- Entity Designer DDL Script for SQL Server 2005, 2008, 2012 and Azure
-- --------------------------------------------------
-- Date Created: 06/08/2018 22:24:33
-- Generated from EDMX file: C:\Users\koenfischer\source\repos\DOTNETWebShop\WcfWebShopLibrary1\WebshopModel.edmx
-- --------------------------------------------------

SET QUOTED_IDENTIFIER OFF;
GO
USE [webshopDB];
GO
IF SCHEMA_ID(N'dbo') IS NULL EXECUTE(N'CREATE SCHEMA [dbo]');
GO

-- --------------------------------------------------
-- Dropping existing FOREIGN KEY constraints
-- --------------------------------------------------

IF OBJECT_ID(N'[dbo].[FK_GebruikerOrder]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[Inventories] DROP CONSTRAINT [FK_GebruikerOrder];
GO
IF OBJECT_ID(N'[dbo].[FK_OrderOrderRegel]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[OrderRegels] DROP CONSTRAINT [FK_OrderOrderRegel];
GO
IF OBJECT_ID(N'[dbo].[FK_OrderRegelProduct]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[OrderRegels] DROP CONSTRAINT [FK_OrderRegelProduct];
GO

-- --------------------------------------------------
-- Dropping existing tables
-- --------------------------------------------------

IF OBJECT_ID(N'[dbo].[Gebruikers]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Gebruikers];
GO
IF OBJECT_ID(N'[dbo].[Inventories]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Inventories];
GO
IF OBJECT_ID(N'[dbo].[Products]', 'U') IS NOT NULL
    DROP TABLE [dbo].[Products];
GO
IF OBJECT_ID(N'[dbo].[OrderRegels]', 'U') IS NOT NULL
    DROP TABLE [dbo].[OrderRegels];
GO

-- --------------------------------------------------
-- Creating all tables
-- --------------------------------------------------

-- Creating table 'Gebruikers'
CREATE TABLE [dbo].[Gebruikers] (
    [Id] int IDENTITY(1,1) NOT NULL,
    [Wachtwoord] nvarchar(max)  NOT NULL,
    [Saldo] float  NOT NULL,
    [Naam] nvarchar(max)  NOT NULL
);
GO

-- Creating table 'Inventories'
CREATE TABLE [dbo].[Inventories] (
    [Id] int IDENTITY(1,1) NOT NULL,
    [GebruikerId] int  NOT NULL,
    [Gebruiker_Id] int  NOT NULL
);
GO

-- Creating table 'Products'
CREATE TABLE [dbo].[Products] (
    [Id] int IDENTITY(1,1) NOT NULL,
    [Prijs] float  NOT NULL,
    [Naam] nvarchar(max)  NOT NULL,
    [Aantal] int  NOT NULL
);
GO

-- Creating table 'OrderRegels'
CREATE TABLE [dbo].[OrderRegels] (
    [Id] int IDENTITY(1,1) NOT NULL,
    [Aantal] int  NOT NULL,
    [InventoryId] int  NOT NULL,
    [Order_Id] int  NOT NULL,
    [Product_Id] int  NOT NULL
);
GO

-- --------------------------------------------------
-- Creating all PRIMARY KEY constraints
-- --------------------------------------------------

-- Creating primary key on [Id] in table 'Gebruikers'
ALTER TABLE [dbo].[Gebruikers]
ADD CONSTRAINT [PK_Gebruikers]
    PRIMARY KEY CLUSTERED ([Id] ASC);
GO

-- Creating primary key on [Id] in table 'Inventories'
ALTER TABLE [dbo].[Inventories]
ADD CONSTRAINT [PK_Inventories]
    PRIMARY KEY CLUSTERED ([Id] ASC);
GO

-- Creating primary key on [Id] in table 'Products'
ALTER TABLE [dbo].[Products]
ADD CONSTRAINT [PK_Products]
    PRIMARY KEY CLUSTERED ([Id] ASC);
GO

-- Creating primary key on [Id] in table 'OrderRegels'
ALTER TABLE [dbo].[OrderRegels]
ADD CONSTRAINT [PK_OrderRegels]
    PRIMARY KEY CLUSTERED ([Id] ASC);
GO

-- --------------------------------------------------
-- Creating all FOREIGN KEY constraints
-- --------------------------------------------------

-- Creating foreign key on [Gebruiker_Id] in table 'Inventories'
ALTER TABLE [dbo].[Inventories]
ADD CONSTRAINT [FK_GebruikerOrder]
    FOREIGN KEY ([Gebruiker_Id])
    REFERENCES [dbo].[Gebruikers]
        ([Id])
    ON DELETE NO ACTION ON UPDATE NO ACTION;
GO

-- Creating non-clustered index for FOREIGN KEY 'FK_GebruikerOrder'
CREATE INDEX [IX_FK_GebruikerOrder]
ON [dbo].[Inventories]
    ([Gebruiker_Id]);
GO

-- Creating foreign key on [Order_Id] in table 'OrderRegels'
ALTER TABLE [dbo].[OrderRegels]
ADD CONSTRAINT [FK_OrderOrderRegel]
    FOREIGN KEY ([Order_Id])
    REFERENCES [dbo].[Inventories]
        ([Id])
    ON DELETE NO ACTION ON UPDATE NO ACTION;
GO

-- Creating non-clustered index for FOREIGN KEY 'FK_OrderOrderRegel'
CREATE INDEX [IX_FK_OrderOrderRegel]
ON [dbo].[OrderRegels]
    ([Order_Id]);
GO

-- Creating foreign key on [Product_Id] in table 'OrderRegels'
ALTER TABLE [dbo].[OrderRegels]
ADD CONSTRAINT [FK_OrderRegelProduct]
    FOREIGN KEY ([Product_Id])
    REFERENCES [dbo].[Products]
        ([Id])
    ON DELETE NO ACTION ON UPDATE NO ACTION;
GO

-- Creating non-clustered index for FOREIGN KEY 'FK_OrderRegelProduct'
CREATE INDEX [IX_FK_OrderRegelProduct]
ON [dbo].[OrderRegels]
    ([Product_Id]);
GO

-- --------------------------------------------------
-- Script has ended
-- --------------------------------------------------