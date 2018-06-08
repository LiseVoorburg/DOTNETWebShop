
-- --------------------------------------------------
-- Entity Designer DDL Script for SQL Server 2005, 2008, 2012 and Azure
-- --------------------------------------------------
-- Date Created: 06/07/2018 11:20:45
-- Generated from EDMX file: C:\Users\lisev\source\repos\WcfWebShopLibrary1\WebShopHost\MyModel.edmx
-- --------------------------------------------------

SET QUOTED_IDENTIFIER OFF;
GO
USE [WebshopDB];
GO
IF SCHEMA_ID(N'dbo') IS NULL EXECUTE(N'CREATE SCHEMA [dbo]');
GO

-- --------------------------------------------------
-- Dropping existing FOREIGN KEY constraints
-- --------------------------------------------------

IF OBJECT_ID(N'[dbo].[FK_orderproduct_order]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[orderproduct] DROP CONSTRAINT [FK_orderproduct_order];
GO
IF OBJECT_ID(N'[dbo].[FK_orderproduct_product]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[orderproduct] DROP CONSTRAINT [FK_orderproduct_product];
GO
IF OBJECT_ID(N'[dbo].[FK_gebruikerorder]', 'F') IS NOT NULL
    ALTER TABLE [dbo].[orderSet] DROP CONSTRAINT [FK_gebruikerorder];
GO

-- --------------------------------------------------
-- Dropping existing tables
-- --------------------------------------------------

IF OBJECT_ID(N'[dbo].[gebruikerSet]', 'U') IS NOT NULL
    DROP TABLE [dbo].[gebruikerSet];
GO
IF OBJECT_ID(N'[dbo].[productSet]', 'U') IS NOT NULL
    DROP TABLE [dbo].[productSet];
GO
IF OBJECT_ID(N'[dbo].[orderSet]', 'U') IS NOT NULL
    DROP TABLE [dbo].[orderSet];
GO
IF OBJECT_ID(N'[dbo].[orderproduct]', 'U') IS NOT NULL
    DROP TABLE [dbo].[orderproduct];
GO

-- --------------------------------------------------
-- Creating all tables
-- --------------------------------------------------

-- Creating table 'gebruikerSet'
CREATE TABLE [dbo].[gebruikerSet] (
    [naam] nvarchar(max)  NOT NULL,
    [wachtwoord] nvarchar(max)  NOT NULL,
    [saldo] int  NOT NULL
);
GO

-- Creating table 'productSet'
CREATE TABLE [dbo].[productSet] (
    [naam] nvarchar(max)  NOT NULL,
    [prijs] int  NOT NULL,
    [aantal] int  NOT NULL
);
GO

-- Creating table 'orderSet'
CREATE TABLE [dbo].[orderSet] (
    [Id] int IDENTITY(1,1) NOT NULL,
    [naamProduct] nvarchar(max)  NOT NULL,
    [aantal] int  NOT NULL,
    [gebruiker_naam] nvarchar(max)  NOT NULL
);
GO

-- Creating table 'orderproduct'
CREATE TABLE [dbo].[orderproduct] (
    [order_Id] int  NOT NULL,
    [product_naam] nvarchar(max)  NOT NULL
);
GO

-- --------------------------------------------------
-- Creating all PRIMARY KEY constraints
-- --------------------------------------------------

-- Creating primary key on [naam] in table 'gebruikerSet'
ALTER TABLE [dbo].[gebruikerSet]
ADD CONSTRAINT [PK_gebruikerSet]
    PRIMARY KEY CLUSTERED ([naam] ASC);
GO

-- Creating primary key on [naam] in table 'productSet'
ALTER TABLE [dbo].[productSet]
ADD CONSTRAINT [PK_productSet]
    PRIMARY KEY CLUSTERED ([naam] ASC);
GO

-- Creating primary key on [Id] in table 'orderSet'
ALTER TABLE [dbo].[orderSet]
ADD CONSTRAINT [PK_orderSet]
    PRIMARY KEY CLUSTERED ([Id] ASC);
GO

-- Creating primary key on [order_Id], [product_naam] in table 'orderproduct'
ALTER TABLE [dbo].[orderproduct]
ADD CONSTRAINT [PK_orderproduct]
    PRIMARY KEY CLUSTERED ([order_Id], [product_naam] ASC);
GO

-- --------------------------------------------------
-- Creating all FOREIGN KEY constraints
-- --------------------------------------------------

-- Creating foreign key on [order_Id] in table 'orderproduct'
ALTER TABLE [dbo].[orderproduct]
ADD CONSTRAINT [FK_orderproduct_order]
    FOREIGN KEY ([order_Id])
    REFERENCES [dbo].[orderSet]
        ([Id])
    ON DELETE NO ACTION ON UPDATE NO ACTION;
GO

-- Creating foreign key on [product_naam] in table 'orderproduct'
ALTER TABLE [dbo].[orderproduct]
ADD CONSTRAINT [FK_orderproduct_product]
    FOREIGN KEY ([product_naam])
    REFERENCES [dbo].[productSet]
        ([naam])
    ON DELETE NO ACTION ON UPDATE NO ACTION;
GO

-- Creating non-clustered index for FOREIGN KEY 'FK_orderproduct_product'
CREATE INDEX [IX_FK_orderproduct_product]
ON [dbo].[orderproduct]
    ([product_naam]);
GO

-- Creating foreign key on [gebruiker_naam] in table 'orderSet'
ALTER TABLE [dbo].[orderSet]
ADD CONSTRAINT [FK_gebruikerorder]
    FOREIGN KEY ([gebruiker_naam])
    REFERENCES [dbo].[gebruikerSet]
        ([naam])
    ON DELETE NO ACTION ON UPDATE NO ACTION;
GO

-- Creating non-clustered index for FOREIGN KEY 'FK_gebruikerorder'
CREATE INDEX [IX_FK_gebruikerorder]
ON [dbo].[orderSet]
    ([gebruiker_naam]);
GO

-- --------------------------------------------------
-- Script has ended
-- --------------------------------------------------